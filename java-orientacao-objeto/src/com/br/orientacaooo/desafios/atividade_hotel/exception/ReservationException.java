package com.br.orientacaooo.desafios.atividade_hotel.exception;

public class ReservationException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ReservationException(String mensagem) {
        super(mensagem);
    }
}

