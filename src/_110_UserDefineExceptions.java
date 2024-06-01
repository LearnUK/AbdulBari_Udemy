class StackOveflowException extends Exception {
    public String toString() {
        return "Stack is Full";
    }
}
class StackUnderflowException extends Exception{
        public String toString(){
            return "Stack is Empty";
        }
}
class Stack{
    private int size;
    private int top = -1;
    private int s[];
    public Stack(int sz)
    {
        size =sz;
        s=new int[sz];
    }
    public void push(int x) throws StackOveflowException{
    if(top==size-1)
        throw new StackOveflowException();
        top++;
        s[top]=x;
    }
    public int pop() throws StackUnderflowException{
        int x=-1;
        if(top==-1)
            throw new StackUnderflowException();
        x=s[top];
        top--;
        return x;
    }
}
public class _110_UserDefineExceptions {
    public static void main(String[] args) {
        Stack st = new Stack(4);
        try{
            st.push(10);
            st.push(20);
            st.push(30);
            st.pop();
            st.pop();
            st.pop();
            st.pop();
        System.out.println(st);
        }catch (StackOveflowException s)
        {
            System.out.println(s);
        }
        catch (StackUnderflowException s)
        {
            System.out.println(s);
        }

    }

}
