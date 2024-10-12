package ma.enset.kafkaspring;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;
@Data
@NoArgsConstructor @AllArgsConstructor
@ToString
public class PageEvent implements Serializable {
    private String name ;
    private String user;
    private Date date;
    private long duration ;
}
