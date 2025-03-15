package dev.sj74.content_calendar.repository;

import dev.sj74.content_calendar.model.Content;
import org.springframework.data.repository.ListCrudRepository;

public interface ContentRepository extends ListCrudRepository<Content, Integer> {

}
