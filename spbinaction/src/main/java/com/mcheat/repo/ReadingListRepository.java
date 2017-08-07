package com.mcheat.repo;

import com.mcheat.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Administrator on 2017/8/4.
 */
public interface ReadingListRepository extends JpaRepository<Book, Long> {


    List<Book> findByReader(String reader);

}
