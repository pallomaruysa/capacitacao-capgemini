package br.com.capgemini.model.entity;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Date;

public class Usuario {
	protected int idUsuario;
	protected String nome;
	protected String telefone;
	protected String email;
	protected Date dataNascimento;
	protected String cpf;
	protected String senha;
	protected boolean ativo;
	
	
	
	public Usuario() {
	}
	
	
	
	public Usuario(int idUsuario, String nome, String telefone, String email, Date dataNascimento, String cpf,
			String senha, boolean ativo) {
		this.idUsuario = idUsuario;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
		this.senha = senha;
		this.ativo = ativo;
	}
	
	public Usuario(String nome, String telefone, String email, Date dataNascimento, String cpf, String senha,
			boolean ativo) {
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
		this.senha = senha;
		this.ativo = ativo;
	}



	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	public String calculoSHA1(String senha) throws UnsupportedEncodingException {
		String sha1=null;
		MessageDigest algorithm;
		try {
			algorithm = MessageDigest.getInstance("SHA-1");
			byte messageDigest[]=algorithm.digest(senha.getBytes("UTF-8"));
			StringBuilder hexString=new StringBuilder();
			for(byte b:messageDigest) {
				hexString.append(String.format("%02X", 0xFF & b));
			}
			sha1=hexString.toString();
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sha1;
		
		
	}
}
