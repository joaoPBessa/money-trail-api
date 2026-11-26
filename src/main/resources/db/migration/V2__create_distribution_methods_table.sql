CREATE TABLE distribution_methods (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    title VARCHAR(100) NOT NULL,
    spend_percentage INTEGER NOT NULL,
    investment_percentage INTEGER NOT NULL,
    created_at TIMESTAMPTZ NOT NULL DEFAULT now(),
    updated_at TIMESTAMPTZ NOT NULL DEFAULT now(),
    CONSTRAINT ck_distribution_methods_spend_percentage CHECK (spend_percentage BETWEEN 0 AND 100),
    CONSTRAINT ck_distribution_methods_investment_percentage CHECK (investment_percentage BETWEEN 0 AND 100),
    CONSTRAINT ck_distribution_methods_percentage_sum CHECK (spend_percentage + investment_percentage = 100)
);

CREATE UNIQUE INDEX ux_distribution_methods_title ON distribution_methods (lower(title));
