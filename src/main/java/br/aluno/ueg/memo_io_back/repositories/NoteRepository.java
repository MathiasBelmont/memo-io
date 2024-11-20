package br.aluno.ueg.memo_io_back.repositories;

import br.aluno.ueg.memo_io_back.models.NoteModel;
import br.aluno.ueg.memo_io_back.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends JpaRepository<NoteModel, Long> {
}
