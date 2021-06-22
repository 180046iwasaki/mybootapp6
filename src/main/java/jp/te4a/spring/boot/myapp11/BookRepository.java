package jp.te4a.spring.boot.myapp11;

import org.springframework.data.jpa.repository.JpaRepository;
public interface BookRepository extends JpaRepository<BookBean, Integer> {

    
}
// public BookForm create(BookForm bookForm) {
//   BookBean bookBean = new BookBean();
//   BeanUtils.copyProperties(bookForm, bookBean);
//   bookRepository.save(bookBean);
//   return bookForm;
// }

// public BookForm update(BookForm bookForm) {
//   BookBean bookBean = new BookBean();
//   BeanUtils.copyProperties(bookForm, bookBean);
//   bookRepository.save(bookBean);
//   return bookForm;
// }
