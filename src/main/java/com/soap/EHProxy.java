
package com.soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Holder;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "EHProxy", targetNamespace = "http://eh.actimize.com")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface EHProxy {


    /**
     * 
     * @param transactionNORMDATETIME
     * @param accountOVERDRAFTLIMIT
     * @param accountLEDGERBALANCE
     * @param trxACCUNCOLLECTEDBAL
     * @param trxACCOVERDRAFTBAL
     * @param trxACCOUNTCURRENTBALANCE
     * @param requestedAMOUNTASENTERED
     * @param trxFIROUTINGNUMBER
     * @param channel
     * @param fundsDIRECTIONCD
     * @param accountOPENDATE
     * @param transactionID
     * @param instrumentDATE
     * @param accountKEY
     * @param trxACCNUMBER
     * @param instrumentNUMBER
     * @param depositOut
     * @param trxFIROUTINGTYPE
     * @param transactionKEY
     * @param partyKEY
     * @param instrumentTYPECD
     * @param transactionTYPE
     * @return
     *     returns wsclient.EHResult
     */
    @WebMethod(operationName = "FF_WS_evaluateDeposit_V7")
    @WebResult(name = "FF_WS_evaluateDeposit_V7Return", partName = "FF_WS_evaluateDeposit_V7Return")
    public EHResult ffWSEvaluateDepositV7(
            @WebParam(name = "TRANSACTION_KEY", partName = "TRANSACTION_KEY")
                    String transactionKEY,
            @WebParam(name = "PARTY_KEY", partName = "PARTY_KEY")
                    String partyKEY,
            @WebParam(name = "TRANSACTION_NORM_DATETIME", partName = "TRANSACTION_NORM_DATETIME")
                    String transactionNORMDATETIME,
            @WebParam(name = "CHANNEL", partName = "CHANNEL")
                    String channel,
            @WebParam(name = "ACCOUNT_KEY", partName = "ACCOUNT_KEY")
                    String accountKEY,
            @WebParam(name = "TRANSACTION_TYPE", partName = "TRANSACTION_TYPE")
                    String transactionTYPE,
            @WebParam(name = "FUNDS_DIRECTION_CD", partName = "FUNDS_DIRECTION_CD")
                    String fundsDIRECTIONCD,
            @WebParam(name = "TRANSACTION_ID", partName = "TRANSACTION_ID")
                    String transactionID,
            @WebParam(name = "INSTRUMENT_NUMBER", partName = "INSTRUMENT_NUMBER")
                    String instrumentNUMBER,
            @WebParam(name = "INSTRUMENT_TYPE_CD", partName = "INSTRUMENT_TYPE_CD")
                    String instrumentTYPECD,
            @WebParam(name = "INSTRUMENT_DATE", partName = "INSTRUMENT_DATE")
                    String instrumentDATE,
            @WebParam(name = "REQUESTED_AMOUNT_AS_ENTERED", partName = "REQUESTED_AMOUNT_AS_ENTERED")
                    String requestedAMOUNTASENTERED,
            @WebParam(name = "ACCOUNT_LEDGER_BALANCE", partName = "ACCOUNT_LEDGER_BALANCE")
                    String accountLEDGERBALANCE,
            @WebParam(name = "TRX_ACCOUNT_CURRENT_BALANCE", partName = "TRX_ACCOUNT_CURRENT_BALANCE")
                    String trxACCOUNTCURRENTBALANCE,
            @WebParam(name = "TRX_ACC_UNCOLLECTED_BAL", partName = "TRX_ACC_UNCOLLECTED_BAL")
                    String trxACCUNCOLLECTEDBAL,
            @WebParam(name = "TRX_ACC_OVER_DRAFT_BAL", partName = "TRX_ACC_OVER_DRAFT_BAL")
                    String trxACCOVERDRAFTBAL,
            @WebParam(name = "TRX_ACC_NUMBER", partName = "TRX_ACC_NUMBER")
                    String trxACCNUMBER,
            @WebParam(name = "TRX_FI_ROUTING_NUMBER", partName = "TRX_FI_ROUTING_NUMBER")
                    String trxFIROUTINGNUMBER,
            @WebParam(name = "TRX_FI_ROUTING_TYPE", partName = "TRX_FI_ROUTING_TYPE")
                    String trxFIROUTINGTYPE,
            @WebParam(name = "ACCOUNT_OPEN_DATE", partName = "ACCOUNT_OPEN_DATE")
                    String accountOPENDATE,
            @WebParam(name = "ACCOUNT_OVERDRAFT_LIMIT", partName = "ACCOUNT_OVERDRAFT_LIMIT")
                    String accountOVERDRAFTLIMIT,
            @WebParam(name = "depositOut", mode = WebParam.Mode.OUT, partName = "depositOut")
                    Holder<FFWSEvaluateDepositV7DepositOutTupleType> depositOut);

}
