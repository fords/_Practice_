$success_count = 0
$failure_count = 0

def deep_dup(arr)
  arr.inject([]) { |acc, el| el.is_a?(Array) ? acc << deep_dup(el) : acc << el }
end

def note_success(returned, invocation, expectation)
  puts "success: #{invocation} => #{expectation}"
  $success_count += 1
end

def note_failure(returned, invocation, expectation)
  puts "failure: #{invocation}: expected #{expectation}, returned #{returned}"
  $failure_count += 1
end

def format_args(args)
  o_args = deep_dup(args)
  o_args.map! do |arg|
    prettify(arg)
  end
  o_args.join(', ')
end

def prettify(statement)
  case statement
  when Float
    statement.round(5)
  when String
    "\"#{statement}\""
  when NilClass
    "nil"
  else
    statement
  end
end

def equality_test(returned, invocation, expectation)
  if returned == expectation && returned.class == expectation.class
    note_success(returned, invocation, expectation)
  else
    note_failure(returned, invocation, expectation)
  end
end

def identity_test(returned, invocation, expectation, args)
  if returned.__id__ == args[0].__id__
    equality_test(returned, invocation, expectation)
  else
    puts "failure: #{invocation}: You did not mutate the original array!"
    $failure_count += 1
  end
end

def method_missing(method_name, *args)
  method_name = method_name.to_s
  expectation = args[-1]
  args = args[0...-1]
  if method_name.start_with?("test_")
    tested_method = method_name[5..-1]
    print_test(tested_method, args, expectation)
  else
    method_name = method_name.to_sym
    super
  end
end

def print_test(method_name, args, expectation)
  returned = self.send(method_name, *args)
  returned = prettify(returned)
  expectation = prettify(expectation)
  args_statement = format_args(args)
  invocation = "#{method_name}(#{args_statement})"
  method_name.include?("!") ? identity_test(returned, invocation, expectation, args) : equality_test(returned, invocation, expectation)
  rescue Exception => e
    puts "failure: #{invocation} threw #{e}"
    puts e.backtrace.select {|t| !t.include?("method_missing") && !t.include?("print_test")}
    $failure_count += 1
end

puts "\nmy_to_s:\n" + "*" * 15 + "\n"
test_my_to_s(3, "3")
test_my_to_s(nil, "")
puts "\nmy_round:\n" + "*" * 15 + "\n"
test_my_round(3.4, 3)
test_my_round(3.5, 4)
puts "\nmy_modulo:\n" + "*" * 15 + "\n"
test_my_modulo(9, 2, 1)
test_my_modulo(10, 4, 2)
puts "\nmy_lcm:\n" + "*" * 15 + "\n"
test_my_lcm(9, 3, 9)
test_my_lcm(4, 6, 12)
puts "\nto_stringified_float:\n" + "*" * 15 + "\n"
test_to_stringified_float(2, "2.0")
test_to_stringified_float(0, "0.0")
puts "\nabsolute_sum:\n" + "*" * 15 + "\n"
test_absolute_sum(2, -2, 4)
test_absolute_sum(2, 2, 4)
puts "\nnegative:\n" + "*" * 15 + "\n"
test_negative(-1, -1)
test_negative(0, 0)
puts "\nlast_digit:\n" + "*" * 15 + "\n"
test_last_digit(1234, 4)
test_last_digit(0, 0)
puts "\nlast_digit_odd?:\n" + "*" * 15 + "\n"
test_last_digit_odd?(1234, false)
test_last_digit_odd?(1233, true)
puts "\ngcd_of_last_digits:\n" + "*" * 15 + "\n"
test_gcd_of_last_digits(93, 9, 3)
test_gcd_of_last_digits(42, 44, 2)
puts "\nlast_n_digits:\n" + "*" * 15 + "\n"
test_last_n_digits(1234, 2, 34)
test_last_n_digits(1234, 1, 4)
puts "\ndec_remainder_of_two_floats:\n" + "*" * 15 + "\n"
test_dec_remainder_of_two_floats(8.0, 5.0, 0.6)
test_dec_remainder_of_two_floats(10.0, 4.0, 0.5)
puts "\ndec_remainder_of_two_integers:\n" + "*" * 15 + "\n"
test_dec_remainder_of_two_integers(8, 5, 0.6)
test_dec_remainder_of_two_integers(10, 4, 0.5)
puts "\nint_remainder_without_modulo:\n" + "*" * 15 + "\n"
test_int_remainder_without_modulo(8, 5, 3)
test_int_remainder_without_modulo(10, 4, 2)
puts 
puts "TOTAL CORRECT: #{$success_count} / #{$success_count + $failure_count}"
puts "TOTAL FAILURES: #{$failure_count}"
$success_count = 0
$failure_count = 0