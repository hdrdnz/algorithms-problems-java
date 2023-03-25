public class RomanToInteger {
    /**
     * <h2>
     *    <u>Status =</u>  <i>Status fonksiyonu  roman rakanlarını ve değerlerini  enum olarak tutar.</i>
     * </h2>
     *
     *
     */
    enum Status {
        I("I", 1),
        V("V", 5),
        X("X", 10),
        L("L", 50),
        C("C", 100),
        D("D", 500),
        M("M", 1000);
        private final String key;
        private final int value;

        Status(String key, int value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public int getValue() {
            return value;
        }



        /**
         * <h2>
         *    <u>getValueByKey(String key) =</u> getValueByKey, kullanıcıdan gelen String ifadenin değer karşığını döndürür. <i></i>
         * </h2>
         *
         *
         */
        public static int getValueByKey(String key){
            if(I.getKey().equals(key)) return  I.getValue();
            else if(V.getKey().equals(key)) return  V.getValue();
            else if(X.getKey().equals(key)) return  X.getValue();
            else if(L.getKey().equals(key)) return L.getValue();
            else if(C.getKey().equals(key)) return C.getValue();
            else if(D.getKey().equals(key)) return D.getValue();
            else if(M.getKey().equals(key)) return M.getValue();
            else return 0;

        }


        /**
         * <h2>
         *    <u>Status.values() =</u>  <i>Status enumundaki bütün değerleri array olarak getirir.</i>
         * </h2>
         * @see #getValueByKey(String)
         *
         */
        public static int getValueByKey2(String key){
            Status[] statuses = Status.values();
            for(int i=0; i<statuses.length;i++){
                Status current = statuses[i];
                if(current.getKey().equals(key)) return  current.getValue();
            }
            return 0;
        }
    }


    /**
     * <h2>
     *    <u>romanToInt(String s)=</u>  <i>RomanToInt metodu gelen string değeri karakterlere ayırarak int değere döndüren ana bir metottur.</i>
     * </h2>
     *
     *
     */
    public static int romanToInt(String s) {
        int top=0;
        for (int i = 0; i < s.length(); i++) {
            int temp=Status.getValueByKey(String.valueOf(s.charAt(i)));
            String key=String.valueOf(s.charAt(i));
            if(i==0) {
                top+=temp;
                continue;
            }
            if(key.equals(Status.V.getKey())|| key.equals(Status.X.getKey())){
                String beforeKey=String.valueOf(s.charAt(i-1));
                if(beforeKey.equals(Status.I.getKey())){
                    temp -=Status.I.getValue()*2;
                }
            }
            else if(key.equals(Status.L.getKey())|| key.equals(Status.C.getKey())){
                String beforeKey=String.valueOf(s.charAt(i-1));
                if(beforeKey.equals(Status.X.getKey())){

                    temp -=Status.X.getValue()*2;
                }
            } else if(key.equals(Status.D.getKey())|| key.equals(Status.M.getKey())){
                String beforeKey=String.valueOf(s.charAt(i-1));
                if(beforeKey.equals(Status.C.getKey())){
                    temp -=Status.C.getValue()*2;
                }
            }


            top +=temp;

        }
        return top;
    }

}

