import java.util.Stack;

public class CrawlerLogFolder {
    public static void main(String[] args) {
        String[] logs={"d1/","d2/","../","d21/","./"};
    }
        static int minOperations(String[] logs) {
            var stack = new Stack<String>();
            for(var log : logs){
                if(log.equals("../")){
                    if(!stack.empty())
                        stack.pop();
                }else if(log.equals("./")){

                }else{
                    stack.push(log);
                }
            }
            return stack.size();
        }
    }

