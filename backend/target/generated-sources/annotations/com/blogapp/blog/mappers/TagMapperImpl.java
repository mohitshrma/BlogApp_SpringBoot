package com.blogapp.blog.mappers;

import com.blogapp.blog.domain.dtos.TagDto;
import com.blogapp.blog.domain.entities.Tag;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-04-24T22:03:37+0545",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
@Component
public class TagMapperImpl implements TagMapper {

    @Override
    public TagDto toTagResponse(Tag tag) {
        if ( tag == null ) {
            return null;
        }

        TagDto.TagDtoBuilder tagDto = TagDto.builder();

        tagDto.postCount( calulcatePostCount( tag.getPosts() ) );
        tagDto.id( tag.getId() );
        tagDto.name( tag.getName() );

        return tagDto.build();
    }
}
