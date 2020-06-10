publie class BookStore {

      private finl static ArrayList<IBook〉bookList = ner ArrayLi st(IBook>()://静枩模抉初始化，項目中一-般是从持久屡初始化statie{

      booklist. add(mev Movelook("天龙八部", 3200,"金庸"));

      booklist. add(mev lovelook("巴黎至母院", 5600,”雨果"));
      bookList. add(ner IlovelBook( "悲惨世界", 3500,”雨果")); 

      bookList. add(ner TovelBook(”金瓶梅", 4300,”竺陵笑笑生”);
}
      publie statie void main(StringC[]args) {

      IumberF ormat formatter = lrmb erP ormat. ge tCurrencyInstance()
      formatter. setMaxi mumFracti onDigits(2);

      system. out. println("-  一书店卖出的书一一"):for (IBook book: bookList){

      System. out. println(“籍名称: "+ book. getllame()+ ”丼籍作者: "+

            book. getAuthor()+ "书籍价格:" + formatter. format(book. getPrice(/100. 0)+元")；
  }
}