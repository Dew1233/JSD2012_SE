package string;

public class O12StringBuilderDemo1 {
    public static void main(String[] args) {
        String str = "好好学习java";

        StringBuffer builder = new StringBuffer(str);

        /**append():追加内容
         *replace():修改操作
         * delete():删除操作
         * insert():插入操作
         */
        builder.append("找个好工作~");
        str = builder.toString();
        System.out.println(str);

        builder.replace(9,16,"就是为了改变！");
        builder.delete(0,8);
        builder.insert(0,"活着");
    }
}
