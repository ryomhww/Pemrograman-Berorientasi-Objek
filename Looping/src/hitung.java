class hitung {
    private int base;
    private int start;
    private int loop;

    public hitung(int base, int start, int loop) {
        this.base = base;
        this.start = start;
        this.loop = loop;
    }

    public void getinfo() {
        for(int i = start; i <= start + loop - 1; i++){
            int result = base * i;
            System.out.println(base + "x" + i +"="+result);
        }
    }
}