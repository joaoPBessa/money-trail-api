CREATE TABLE revenue_types (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    name VARCHAR(100) NOT NULL,
    created_at TIMESTAMPTZ NOT NULL DEFAULT now(),
    updated_at TIMESTAMPTZ NOT NULL DEFAULT now()
);

CREATE UNIQUE INDEX ux_revenue_types_name ON revenue_types (lower(name));

INSERT INTO revenue_types (name) VALUES
    ('Saldo Disponível'),
    ('Salário Próprio'),
    ('Salário Cônjuge'),
    ('Vale Refeição/Alimentação'),
    ('Estorno'),
    ('Resgate de Aplicação');
