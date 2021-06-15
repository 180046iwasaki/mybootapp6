package jp.te4a.spring.boot.myapp9;

import com.xlrit.gears.base.repository.JpaRepository;

import org.springframework.stereotype.Repository;

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
