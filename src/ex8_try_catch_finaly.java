public class ex8_try_catch_finaly {
    public static void main(String[] args) {
        /*
        tru - catch - finaly:  dùng để bắt lỗi và hiển thị cho người dùng
        * */
 /*       try {
            // công việc
        }
        catch (Exception ex){  // Exception: bắt tất cả lổi
            // bắt lỗi
            ex.printStackTrace(); // in ra thông báo cụ thể
        }
*/
  //  Exception: bắt tất cả lổi ( nên dùng)
// ArrithmeticException: là một lỗi đc hiện khi một điều kiện toán học bất thuòng xảy ra
        // finaly : đc dùng trong khối có lỗi hay không có lổi
        int a =10, b = 0;
        try {
            int c = a/b;
        System.out.println("c = " + c);
        } catch (Exception ex){
            System.out.println("có lỗi");
            ex.printStackTrace();
        } finally {
            System.out.println("có hay không điều làm");
        }
    }
}
