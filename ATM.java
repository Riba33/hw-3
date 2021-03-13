class ATM {
      public int countBanknotes(int sum) {
           int money = sum, count = 0, i = 0;
        int[] banks = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        while ( i < banks.length) {
         if (money / banks[i] != 0) {
             count += money / banks[i];
             money %= banks[i];
             
         } i++;
        }
        return count;
      }
}
