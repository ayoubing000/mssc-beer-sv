package fiverr.springframework.msscbeersv.web.model;

import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class BeerPagesList extends PageImpl<BeerDto> {
    public BeerPagesList(List<BeerDto> content, Pageable pageable, long total) {
        super(content, pageable, total);
    }

    public BeerPagesList(List<BeerDto> content) {
        super(content);
    }
}
