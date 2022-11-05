package fuckingrullet.server.question.dto;

import lombok.Getter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

@Getter
public class TagDto {
    @Positive
    private Long tagId;

    @NotBlank(message = "태그명을 기입해주세요")
    private String tagName;
}
