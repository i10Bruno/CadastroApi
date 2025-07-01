-- migrations para adicionar rank na tabela de tarefas

ALTER TABLE tb_tarefas
ADD COLUMN rank VARCHAR(255);