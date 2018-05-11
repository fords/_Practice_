def dec_to_bin(number):
    rem = 0;
    dividend = number;
    quotient = 0;
    bin = [];
    while dividend > 0:
        rem = dividend%2
        quotient = (dividend/2)
        dividend = quotient
        bin.append(rem)
    bin.reverse()
    bin_str =  "".join(str(x) for x in bin)
    return bin_str