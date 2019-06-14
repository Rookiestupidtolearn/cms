package com.jspxcms.ext.repository;

import com.jspxcms.ext.domain.GuestbookType;
import com.jspxcms.ext.domain.MyTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

public interface MyTestDao extends JpaRepository<MyTest, Long> {

}
