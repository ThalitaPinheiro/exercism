module.exports = function(year) {
    function shouldLeap() {
        let givenYear = (function (dividend) {
            return {
                isDivisible: function (divisor) {
                    return ((dividend%divisor)===0)
                }
            }
        })(year);
        return (givenYear.isDivisible(4) &&
                !givenYear.isDivisible(100) ||
                givenYear.isDivisible(400));
    }

    return {
        isLeap : function() {
            return !!shouldLeap()
        }
    };
};
