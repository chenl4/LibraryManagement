package library.demo.Controller;
// package library.demo.Controller;

// import java.util.*;

// import org.springframework.stereotype.Controller;

// import library.demo.Entity.Book;

// @Controller
// public class BookController {
 
//     //用于记录图书编号
//     public static int count = 1;
//     //用于记录图书信息
//     public static List<Book> list = new ArrayList<>();
 
 
//     //添加图书信息
//     @RequestMapping(value="/add", method= RequestMethod.POST)
//     public String addBook(@RequestParam("name") String BookName,
//                           @RequestParam("prize") Integer Prize){
//         Book book = new Book(count++, BookName, Prize);
//         list.add(book);
//         return "index"; //返回到图书添加页面
//     }
 
 
//     //查询所有图书
//     @RequestMapping("/selectAll")
//     public String selectAll(Model model){
//         model.addAttribute("books", this.list);
//         return "show";
//     }
 
 
//     //删除图书信息
//     @RequestMapping(value = "delete/{id}", method = RequestMethod.GET)
//     public String deleteById(@PathVariable("id") int id, Model model){
//         for (Book li : list){
//             if(li.getId_b()==id){
//                 list.remove(li);
//                 break;
//             }
//         }
//         return "redirect:/selectAll";
//     }
 
// }
