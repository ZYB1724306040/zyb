interface IBook {

      //书籍有名称

      public String getlame()://书籍有售价

      public int getPrice();//书籍有作者

      public String getAuthor();
}

//小说书接的源代码如下:

class MovelBook imple ents IBook {

      //书籍名称

      private String name;//书籍的价格

      private int price;//书籍的作者

      private String author ://通过构造函数传递书籍数据

      public MovelBook(String name, int price, String_ author){

      this. name = _name:
      this. price = - price;
      this. author =_ author ;
}

      //获得作者是谁

      public String getAuthor() 1  return this. author;s //书籍叫什么名字

      public String getllame() i  return this. name; 1//获得书籍的价格

      public int getPrice() li return this. price;
}
