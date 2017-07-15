module.exports = function () {
    return {
        compute:  (firstChain, secondChain) => {
            if(firstChain.length !== secondChain.length){
                throw new Error('DNA strands must be of equal length.');
            }

            return firstChain.split('').reduce( function (accumulator, currentValue, index) {
                if (currentValue === secondChain.charAt(index)) {
                    return accumulator;
                }
                return accumulator + 1;
            }, 0);
        }
    }
};