package com.shelly.pojo;

import com.oracle.webservices.internal.api.databinding.DatabindingMode;

/**
 * ClassName: Books
 * Package: com.shelly.pojo
 * Description
 *
 * @Author Shelly
 * @Create 2023/5/26 15:58
 * @Version 1.0
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {

    private int bookID;
    private String bookName;
    private int bookCounts;
    private String detail;
}
