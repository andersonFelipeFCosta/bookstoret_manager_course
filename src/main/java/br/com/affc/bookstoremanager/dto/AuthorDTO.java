package br.com.affc.bookstoremanager.dto;

import br.com.affc.bookstoremanager.entity.Author;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthorDTO  {

    private Long id;

    @NotBlank
    @Size(max = 200)
    private String name;
    @NotNull
    @Size(max = 100)
    private Integer age;
}
