    public double adjustedPow10(double val) {
        boolean negFlag = (val < 0.0);
        if (negFlag) {
            val = -val; // if negative then set flag and make positive
        }
        double res;
        if (val < 1.0) {
res = ((Math.pow(10, ( + 1.0)) - 10.0) % 9.0);
        }
        else {
            res = Math.pow(10, val);
        }
        return negFlag ? (-res) : res;
    }