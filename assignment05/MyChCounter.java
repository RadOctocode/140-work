package assignment05;

public class MyChCounter {
    char c;
    int count = 1;
    MyChCounter(char c1) {
        c = c1;
    }
    void increment() {
        count++;
    }
    @Override
    public boolean equals(Object obj) {
        boolean retVal = false;
        if(obj != null && getClass() == obj.getClass()) {
            MyChCounter m = (MyChCounter)obj;
            retVal = (c == m.c && count == m.count);
        }
        return retVal;
    }        
    @Override
    public int hashCode() {
        return Character.hashCode(c)*31 + Integer.hashCode(count);
    }
}//end of class