package com.renan.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "USUARIO")
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer USUARIO;

    @NotEmpty
    @Size(max = 50)
    @Column(name = "NOME")
    private String NOME;

    @NotEmpty
    @Size(max = 30)
    @Column(name = "LOGON")
    private String LOGON;

    @NotEmpty
    @Size(max = 15)
    @Column(name = "SENHA")
    private String SENHA;

    @NotEmpty
    @Size(min = 1, max = 1)
    @Column(name = "DESATIVADO")
    private Integer DESATIVADO;

    @NotNull
    @Column(name = "INICIO_VIGENCIA")
    private Date INICIO_VIGENCIA;

    @NotNull
    @Column(name = "FINAL_VIGENCIA")
    private Date FINAL_VIGENCIA;

    private String ATUALIZACAO;
    private Integer ADMINISTRALICENCA;
    private Integer SNDI;
    private Integer SNDA;
    private Integer SNDE;
    private Integer ALMOXARIFADOI;
    private Integer ALMOXARIFADOA;
    private Integer ALMOXARIFADOE;
    private Integer FARMACIAI;
    private Integer FARMACIAA;
    private Integer FARMACIAE;
    private Integer ESTOQUEI;
    private Integer ESTOQUEA;
    private Integer ESTOQUEE;
    private String EMAILPADRAOCOTACAO;
    private Integer PRESCRICAOINTERNO;
    private Integer PRESCRICAOAMBULATORIAL;
    private Integer PRESCRICAOURGENCIA;
    private Integer CCPADRAOCOTACAO;
    private String OBSERVACAO;
    private Integer TELAMEDICOAPENASCONSULTA;
    private Integer ALTERAGUIATELATRANSFERENCIA;
    private Integer ALTERA_TABELA_PRECO_CONVENIO;
    private Integer PRESCRICAOEXTERNO;
    private Integer MEDICO_APENASCBO;
    private Integer MEDICO_CADASTROESPECIALIDADE;
    private Integer MEDICO_CADASTROCLASSIFICACAO;
    private Integer MEDICO_CADASTROHORARIO;
    private Integer MEDICO;
    private Integer TUTORPRESCRICAO;
    private Integer ADMINISTRACUSTO;
    private Integer EXCLUIBAIXAFINANCEIROCOMPENSADO;
    private Integer EXCLUIRAGENDACONSULTA;
    private Integer PERMITEREEMPRIMIRPRESCRICAO;
    private Integer PERMITEALTERANOME;
    private Integer PREPARAKITMEDICAMENTO;
    private Integer PERMITE_ALTERAR_LANC_PAGTERCEIRO;
    private Integer NAOPERMITEALTERARAGENDAMENTO;
    private Integer NAOPERMITEALTERACAOFINANCEIRO;
    private Integer REFERENCIA;
    private Integer UNIDADEENCAMINHAMENTO;
    private Integer PERMITE_APENAS_LANCAR_CONTASRECEBER;
    private Integer PERMITE_CONFERIR_LAUDO;
    private Integer USUARIOUNIMED;
    private Integer GERENTE;
    private Integer NAOPERMITECANCELARREGISTROS;
    private Integer PERMISSAOPREDEVOLUCAO;
    private Integer PERMISSAODEVOLUCAO;
    private Integer PERMITEDEVOLUCAODIRETA;
    private Integer MEDICO_CADASTROHONORARIO;
    private Integer RELPRESCSOMENTEDIETA;
    private String CPF;
    private String RG;
    private Date DATANASC;
    private Integer INICIALIZARSENHA;
    private Date DATA_ATUALIZACAO_SENHA;
    private Byte[] LOGO;
    private Integer pres_cad_tutor;
    private Integer RELCONTROLEPRONTUARIO;
    private Integer PERMITEBAIXAMANUAL;

    public UsuarioModel() {

    }

    public UsuarioModel(Integer usuario, String nome, String logon, String senha, Integer desativado, Date inicio_vigencia, Date final_vigencia) {
        this.USUARIO = usuario;
        this.NOME = nome;
        this.LOGON = logon;
        this.SENHA = senha;
        this.DESATIVADO = desativado;
        this.INICIO_VIGENCIA = inicio_vigencia;
        this.FINAL_VIGENCIA = final_vigencia;
    }

    public Integer getUSUARIO() {
        return USUARIO;
    }

    public void setUSUARIO(Integer USUARIO) {
        this.USUARIO = USUARIO;
    }

    public String getNOME() {
        return NOME;
    }

    public void setNOME(String NOME) {
        this.NOME = NOME;
    }

    public String getLOGON() {
        return LOGON;
    }

    public void setLOGON(String LOGON) {
        this.LOGON = LOGON;
    }

    public String getSENHA() {
        return SENHA;
    }

    public void setSENHA(String SENHA) {
        this.SENHA = SENHA;
    }

    public String getATUALIZACAO() {
        return ATUALIZACAO;
    }

    public void setATUALIZACAO(String ATUALIZACAO) {
        this.ATUALIZACAO = ATUALIZACAO;
    }

    public Integer getADMINISTRALICENCA() {
        return ADMINISTRALICENCA;
    }

    public void setADMINISTRALICENCA(Integer ADMINISTRALICENCA) {
        this.ADMINISTRALICENCA = ADMINISTRALICENCA;
    }

    public Integer getSNDI() {
        return SNDI;
    }

    public void setSNDI(Integer SNDI) {
        this.SNDI = SNDI;
    }

    public Integer getSNDA() {
        return SNDA;
    }

    public void setSNDA(Integer SNDA) {
        this.SNDA = SNDA;
    }

    public Integer getSNDE() {
        return SNDE;
    }

    public void setSNDE(Integer SNDE) {
        this.SNDE = SNDE;
    }

    public Integer getALMOXARIFADOI() {
        return ALMOXARIFADOI;
    }

    public void setALMOXARIFADOI(Integer ALMOXARIFADOI) {
        this.ALMOXARIFADOI = ALMOXARIFADOI;
    }

    public Integer getALMOXARIFADOA() {
        return ALMOXARIFADOA;
    }

    public void setALMOXARIFADOA(Integer ALMOXARIFADOA) {
        this.ALMOXARIFADOA = ALMOXARIFADOA;
    }

    public Integer getALMOXARIFADOE() {
        return ALMOXARIFADOE;
    }

    public void setALMOXARIFADOE(Integer ALMOXARIFADOE) {
        this.ALMOXARIFADOE = ALMOXARIFADOE;
    }

    public Integer getFARMACIAI() {
        return FARMACIAI;
    }

    public void setFARMACIAI(Integer FARMACIAI) {
        this.FARMACIAI = FARMACIAI;
    }

    public Integer getFARMACIAA() {
        return FARMACIAA;
    }

    public void setFARMACIAA(Integer FARMACIAA) {
        this.FARMACIAA = FARMACIAA;
    }

    public Integer getFARMACIAE() {
        return FARMACIAE;
    }

    public void setFARMACIAE(Integer FARMACIAE) {
        this.FARMACIAE = FARMACIAE;
    }

    public Integer getESTOQUEI() {
        return ESTOQUEI;
    }

    public void setESTOQUEI(Integer ESTOQUEI) {
        this.ESTOQUEI = ESTOQUEI;
    }

    public Integer getESTOQUEA() {
        return ESTOQUEA;
    }

    public void setESTOQUEA(Integer ESTOQUEA) {
        this.ESTOQUEA = ESTOQUEA;
    }

    public Integer getESTOQUEE() {
        return ESTOQUEE;
    }

    public void setESTOQUEE(Integer ESTOQUEE) {
        this.ESTOQUEE = ESTOQUEE;
    }

    public String getEMAILPADRAOCOTACAO() {
        return EMAILPADRAOCOTACAO;
    }

    public void setEMAILPADRAOCOTACAO(String EMAILPADRAOCOTACAO) {
        this.EMAILPADRAOCOTACAO = EMAILPADRAOCOTACAO;
    }

    public Integer getPRESCRICAOINTERNO() {
        return PRESCRICAOINTERNO;
    }

    public void setPRESCRICAOINTERNO(Integer PRESCRICAOINTERNO) {
        this.PRESCRICAOINTERNO = PRESCRICAOINTERNO;
    }

    public Integer getPRESCRICAOAMBULATORIAL() {
        return PRESCRICAOAMBULATORIAL;
    }

    public void setPRESCRICAOAMBULATORIAL(Integer PRESCRICAOAMBULATORIAL) {
        this.PRESCRICAOAMBULATORIAL = PRESCRICAOAMBULATORIAL;
    }

    public Integer getPRESCRICAOURGENCIA() {
        return PRESCRICAOURGENCIA;
    }

    public void setPRESCRICAOURGENCIA(Integer PRESCRICAOURGENCIA) {
        this.PRESCRICAOURGENCIA = PRESCRICAOURGENCIA;
    }

    public Integer getCCPADRAOCOTACAO() {
        return CCPADRAOCOTACAO;
    }

    public void setCCPADRAOCOTACAO(Integer CCPADRAOCOTACAO) {
        this.CCPADRAOCOTACAO = CCPADRAOCOTACAO;
    }

    public String getOBSERVACAO() {
        return OBSERVACAO;
    }

    public void setOBSERVACAO(String OBSERVACAO) {
        this.OBSERVACAO = OBSERVACAO;
    }

    public Integer getDESATIVADO() {
        return DESATIVADO;
    }

    public void setDESATIVADO(Integer DESATIVADO) {
        this.DESATIVADO = DESATIVADO;
    }

    public Integer getTELAMEDICOAPENASCONSULTA() {
        return TELAMEDICOAPENASCONSULTA;
    }

    public void setTELAMEDICOAPENASCONSULTA(Integer TELAMEDICOAPENASCONSULTA) {
        this.TELAMEDICOAPENASCONSULTA = TELAMEDICOAPENASCONSULTA;
    }

    public Integer getALTERAGUIATELATRANSFERENCIA() {
        return ALTERAGUIATELATRANSFERENCIA;
    }

    public void setALTERAGUIATELATRANSFERENCIA(Integer ALTERAGUIATELATRANSFERENCIA) {
        this.ALTERAGUIATELATRANSFERENCIA = ALTERAGUIATELATRANSFERENCIA;
    }

    public Integer getALTERA_TABELA_PRECO_CONVENIO() {
        return ALTERA_TABELA_PRECO_CONVENIO;
    }

    public void setALTERA_TABELA_PRECO_CONVENIO(Integer ALTERA_TABELA_PRECO_CONVENIO) {
        this.ALTERA_TABELA_PRECO_CONVENIO = ALTERA_TABELA_PRECO_CONVENIO;
    }

    public Integer getPRESCRICAOEXTERNO() {
        return PRESCRICAOEXTERNO;
    }

    public void setPRESCRICAOEXTERNO(Integer PRESCRICAOEXTERNO) {
        this.PRESCRICAOEXTERNO = PRESCRICAOEXTERNO;
    }

    public Integer getMEDICO_APENASCBO() {
        return MEDICO_APENASCBO;
    }

    public void setMEDICO_APENASCBO(Integer MEDICO_APENASCBO) {
        this.MEDICO_APENASCBO = MEDICO_APENASCBO;
    }

    public Integer getMEDICO_CADASTROESPECIALIDADE() {
        return MEDICO_CADASTROESPECIALIDADE;
    }

    public void setMEDICO_CADASTROESPECIALIDADE(Integer MEDICO_CADASTROESPECIALIDADE) {
        this.MEDICO_CADASTROESPECIALIDADE = MEDICO_CADASTROESPECIALIDADE;
    }

    public Integer getMEDICO_CADASTROCLASSIFICACAO() {
        return MEDICO_CADASTROCLASSIFICACAO;
    }

    public void setMEDICO_CADASTROCLASSIFICACAO(Integer MEDICO_CADASTROCLASSIFICACAO) {
        this.MEDICO_CADASTROCLASSIFICACAO = MEDICO_CADASTROCLASSIFICACAO;
    }

    public Integer getMEDICO_CADASTROHORARIO() {
        return MEDICO_CADASTROHORARIO;
    }

    public void setMEDICO_CADASTROHORARIO(Integer MEDICO_CADASTROHORARIO) {
        this.MEDICO_CADASTROHORARIO = MEDICO_CADASTROHORARIO;
    }

    public Integer getMEDICO() {
        return MEDICO;
    }

    public void setMEDICO(Integer MEDICO) {
        this.MEDICO = MEDICO;
    }

    public Integer getTUTORPRESCRICAO() {
        return TUTORPRESCRICAO;
    }

    public void setTUTORPRESCRICAO(Integer TUTORPRESCRICAO) {
        this.TUTORPRESCRICAO = TUTORPRESCRICAO;
    }

    public Integer getADMINISTRACUSTO() {
        return ADMINISTRACUSTO;
    }

    public void setADMINISTRACUSTO(Integer ADMINISTRACUSTO) {
        this.ADMINISTRACUSTO = ADMINISTRACUSTO;
    }

    public Integer getEXCLUIBAIXAFINANCEIROCOMPENSADO() {
        return EXCLUIBAIXAFINANCEIROCOMPENSADO;
    }

    public void setEXCLUIBAIXAFINANCEIROCOMPENSADO(Integer EXCLUIBAIXAFINANCEIROCOMPENSADO) {
        this.EXCLUIBAIXAFINANCEIROCOMPENSADO = EXCLUIBAIXAFINANCEIROCOMPENSADO;
    }

    public Integer getEXCLUIRAGENDACONSULTA() {
        return EXCLUIRAGENDACONSULTA;
    }

    public void setEXCLUIRAGENDACONSULTA(Integer EXCLUIRAGENDACONSULTA) {
        this.EXCLUIRAGENDACONSULTA = EXCLUIRAGENDACONSULTA;
    }

    public Integer getPERMITEREEMPRIMIRPRESCRICAO() {
        return PERMITEREEMPRIMIRPRESCRICAO;
    }

    public void setPERMITEREEMPRIMIRPRESCRICAO(Integer PERMITEREEMPRIMIRPRESCRICAO) {
        this.PERMITEREEMPRIMIRPRESCRICAO = PERMITEREEMPRIMIRPRESCRICAO;
    }

    public Integer getPERMITEALTERANOME() {
        return PERMITEALTERANOME;
    }

    public void setPERMITEALTERANOME(Integer PERMITEALTERANOME) {
        this.PERMITEALTERANOME = PERMITEALTERANOME;
    }

    public Integer getPREPARAKITMEDICAMENTO() {
        return PREPARAKITMEDICAMENTO;
    }

    public void setPREPARAKITMEDICAMENTO(Integer PREPARAKITMEDICAMENTO) {
        this.PREPARAKITMEDICAMENTO = PREPARAKITMEDICAMENTO;
    }

    public Integer getPERMITE_ALTERAR_LANC_PAGTERCEIRO() {
        return PERMITE_ALTERAR_LANC_PAGTERCEIRO;
    }

    public void setPERMITE_ALTERAR_LANC_PAGTERCEIRO(Integer PERMITE_ALTERAR_LANC_PAGTERCEIRO) {
        this.PERMITE_ALTERAR_LANC_PAGTERCEIRO = PERMITE_ALTERAR_LANC_PAGTERCEIRO;
    }

    public Integer getNAOPERMITEALTERARAGENDAMENTO() {
        return NAOPERMITEALTERARAGENDAMENTO;
    }

    public void setNAOPERMITEALTERARAGENDAMENTO(Integer NAOPERMITEALTERARAGENDAMENTO) {
        this.NAOPERMITEALTERARAGENDAMENTO = NAOPERMITEALTERARAGENDAMENTO;
    }

    public Integer getNAOPERMITEALTERACAOFINANCEIRO() {
        return NAOPERMITEALTERACAOFINANCEIRO;
    }

    public void setNAOPERMITEALTERACAOFINANCEIRO(Integer NAOPERMITEALTERACAOFINANCEIRO) {
        this.NAOPERMITEALTERACAOFINANCEIRO = NAOPERMITEALTERACAOFINANCEIRO;
    }

    public Integer getREFERENCIA() {
        return REFERENCIA;
    }

    public void setREFERENCIA(Integer REFERENCIA) {
        this.REFERENCIA = REFERENCIA;
    }

    public Integer getUNIDADEENCAMINHAMENTO() {
        return UNIDADEENCAMINHAMENTO;
    }

    public void setUNIDADEENCAMINHAMENTO(Integer UNIDADEENCAMINHAMENTO) {
        this.UNIDADEENCAMINHAMENTO = UNIDADEENCAMINHAMENTO;
    }

    public Integer getPERMITE_APENAS_LANCAR_CONTASRECEBER() {
        return PERMITE_APENAS_LANCAR_CONTASRECEBER;
    }

    public void setPERMITE_APENAS_LANCAR_CONTASRECEBER(Integer PERMITE_APENAS_LANCAR_CONTASRECEBER) {
        this.PERMITE_APENAS_LANCAR_CONTASRECEBER = PERMITE_APENAS_LANCAR_CONTASRECEBER;
    }

    public Integer getPERMITE_CONFERIR_LAUDO() {
        return PERMITE_CONFERIR_LAUDO;
    }

    public void setPERMITE_CONFERIR_LAUDO(Integer PERMITE_CONFERIR_LAUDO) {
        this.PERMITE_CONFERIR_LAUDO = PERMITE_CONFERIR_LAUDO;
    }

    public Integer getUSUARIOUNIMED() {
        return USUARIOUNIMED;
    }

    public void setUSUARIOUNIMED(Integer USUARIOUNIMED) {
        this.USUARIOUNIMED = USUARIOUNIMED;
    }

    public Integer getGERENTE() {
        return GERENTE;
    }

    public void setGERENTE(Integer GERENTE) {
        this.GERENTE = GERENTE;
    }

    public Integer getNAOPERMITECANCELARREGISTROS() {
        return NAOPERMITECANCELARREGISTROS;
    }

    public void setNAOPERMITECANCELARREGISTROS(Integer NAOPERMITECANCELARREGISTROS) {
        this.NAOPERMITECANCELARREGISTROS = NAOPERMITECANCELARREGISTROS;
    }

    public Integer getPERMISSAOPREDEVOLUCAO() {
        return PERMISSAOPREDEVOLUCAO;
    }

    public void setPERMISSAOPREDEVOLUCAO(Integer PERMISSAOPREDEVOLUCAO) {
        this.PERMISSAOPREDEVOLUCAO = PERMISSAOPREDEVOLUCAO;
    }

    public Integer getPERMISSAODEVOLUCAO() {
        return PERMISSAODEVOLUCAO;
    }

    public void setPERMISSAODEVOLUCAO(Integer PERMISSAODEVOLUCAO) {
        this.PERMISSAODEVOLUCAO = PERMISSAODEVOLUCAO;
    }

    public Integer getPERMITEDEVOLUCAODIRETA() {
        return PERMITEDEVOLUCAODIRETA;
    }

    public void setPERMITEDEVOLUCAODIRETA(Integer PERMITEDEVOLUCAODIRETA) {
        this.PERMITEDEVOLUCAODIRETA = PERMITEDEVOLUCAODIRETA;
    }

    public Integer getMEDICO_CADASTROHONORARIO() {
        return MEDICO_CADASTROHONORARIO;
    }

    public void setMEDICO_CADASTROHONORARIO(Integer MEDICO_CADASTROHONORARIO) {
        this.MEDICO_CADASTROHONORARIO = MEDICO_CADASTROHONORARIO;
    }

    public Integer getRELPRESCSOMENTEDIETA() {
        return RELPRESCSOMENTEDIETA;
    }

    public void setRELPRESCSOMENTEDIETA(Integer RELPRESCSOMENTEDIETA) {
        this.RELPRESCSOMENTEDIETA = RELPRESCSOMENTEDIETA;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public Date getDATANASC() {
        return DATANASC;
    }

    public void setDATANASC(Date DATANASC) {
        this.DATANASC = DATANASC;
    }

    public Integer getINICIALIZARSENHA() {
        return INICIALIZARSENHA;
    }

    public void setINICIALIZARSENHA(Integer INICIALIZARSENHA) {
        this.INICIALIZARSENHA = INICIALIZARSENHA;
    }

    public Date getDATA_ATUALIZACAO_SENHA() {
        return DATA_ATUALIZACAO_SENHA;
    }

    public void setDATA_ATUALIZACAO_SENHA(Date DATA_ATUALIZACAO_SENHA) {
        this.DATA_ATUALIZACAO_SENHA = DATA_ATUALIZACAO_SENHA;
    }

    public Byte[] getLOGO() {
        return LOGO;
    }

    public void setLOGO(Byte[] LOGO) {
        this.LOGO = LOGO;
    }

    public Integer getPres_cad_tutor() {
        return pres_cad_tutor;
    }

    public void setPres_cad_tutor(Integer pres_cad_tutor) {
        this.pres_cad_tutor = pres_cad_tutor;
    }

    public Integer getRELCONTROLEPRONTUARIO() {
        return RELCONTROLEPRONTUARIO;
    }

    public void setRELCONTROLEPRONTUARIO(Integer RELCONTROLEPRONTUARIO) {
        this.RELCONTROLEPRONTUARIO = RELCONTROLEPRONTUARIO;
    }

    public Integer getPERMITEBAIXAMANUAL() {
        return PERMITEBAIXAMANUAL;
    }

    public void setPERMITEBAIXAMANUAL(Integer PERMITEBAIXAMANUAL) {
        this.PERMITEBAIXAMANUAL = PERMITEBAIXAMANUAL;
    }

    public Date getINICIO_VIGENCIA() {
        return INICIO_VIGENCIA;
    }

    public void setINICIO_VIGENCIA(Date INICIO_VIGENCIA) {
        this.INICIO_VIGENCIA = INICIO_VIGENCIA;
    }

    public Date getFINAL_VIGENCIA() {
        return FINAL_VIGENCIA;
    }

    public void setFINAL_VIGENCIA(Date FINAL_VIGENCIA) {
        this.FINAL_VIGENCIA = FINAL_VIGENCIA;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsuarioModel that = (UsuarioModel) o;
        return USUARIO.equals(that.USUARIO) &&
                NOME.equals(that.NOME);
    }

    @Override
    public int hashCode() {
        return Objects.hash(USUARIO, NOME);
    }
}
