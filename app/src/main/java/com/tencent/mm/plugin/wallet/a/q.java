package com.tencent.mm.plugin.wallet.a;

import com.tencent.mm.bk.b;
import java.util.LinkedList;

public final class q
  extends com.tencent.mm.bk.a
{
  public String lNT;
  public String pdS;
  public String pdT;
  public String pdU;
  public int peI;
  public int peJ;
  public long peK;
  public String peL;
  public String peM;
  public String peN;
  public double peO;
  public double peP;
  public int peQ;
  public String peR;
  public String peS;
  public LinkedList<b> peT = new LinkedList();
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.peI);
      paramVarArgs.fT(2, this.peJ);
      paramVarArgs.T(3, this.peK);
      if (this.peL != null) {
        paramVarArgs.g(4, this.peL);
      }
      if (this.pdS != null) {
        paramVarArgs.g(5, this.pdS);
      }
      if (this.peM != null) {
        paramVarArgs.g(6, this.peM);
      }
      if (this.peN != null) {
        paramVarArgs.g(7, this.peN);
      }
      if (this.pdT != null) {
        paramVarArgs.g(8, this.pdT);
      }
      if (this.pdU != null) {
        paramVarArgs.g(9, this.pdU);
      }
      paramVarArgs.c(10, this.peO);
      paramVarArgs.c(11, this.peP);
      paramVarArgs.fT(12, this.peQ);
      if (this.peR != null) {
        paramVarArgs.g(13, this.peR);
      }
      if (this.lNT != null) {
        paramVarArgs.g(14, this.lNT);
      }
      if (this.peS != null) {
        paramVarArgs.g(16, this.peS);
      }
      paramVarArgs.d(17, 6, this.peT);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = f.a.a.a.fQ(1, this.peI) + 0 + f.a.a.a.fQ(2, this.peJ) + f.a.a.a.S(3, this.peK);
      paramInt = i;
      if (this.peL != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.peL);
      }
      i = paramInt;
      if (this.pdS != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.pdS);
      }
      paramInt = i;
      if (this.peM != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.peM);
      }
      i = paramInt;
      if (this.peN != null) {
        i = paramInt + f.a.a.b.b.a.h(7, this.peN);
      }
      paramInt = i;
      if (this.pdT != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.pdT);
      }
      i = paramInt;
      if (this.pdU != null) {
        i = paramInt + f.a.a.b.b.a.h(9, this.pdU);
      }
      i = i + (f.a.a.b.b.a.ec(10) + 8) + (f.a.a.b.b.a.ec(11) + 8) + f.a.a.a.fQ(12, this.peQ);
      paramInt = i;
      if (this.peR != null) {
        paramInt = i + f.a.a.b.b.a.h(13, this.peR);
      }
      i = paramInt;
      if (this.lNT != null) {
        i = paramInt + f.a.a.b.b.a.h(14, this.lNT);
      }
      paramInt = i;
      if (this.peS != null) {
        paramInt = i + f.a.a.b.b.a.h(16, this.peS);
      }
      return paramInt + f.a.a.a.c(17, 6, this.peT);
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.peT.clear();
      paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      return 0;
    }
    if (paramInt == 3)
    {
      f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
      q localq = (q)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      case 15: 
      default: 
        return -1;
      case 1: 
        localq.peI = locala.vHC.rY();
        return 0;
      case 2: 
        localq.peJ = locala.vHC.rY();
        return 0;
      case 3: 
        localq.peK = locala.vHC.rZ();
        return 0;
      case 4: 
        localq.peL = locala.vHC.readString();
        return 0;
      case 5: 
        localq.pdS = locala.vHC.readString();
        return 0;
      case 6: 
        localq.peM = locala.vHC.readString();
        return 0;
      case 7: 
        localq.peN = locala.vHC.readString();
        return 0;
      case 8: 
        localq.pdT = locala.vHC.readString();
        return 0;
      case 9: 
        localq.pdU = locala.vHC.readString();
        return 0;
      case 10: 
        localq.peO = locala.vHC.readDouble();
        return 0;
      case 11: 
        localq.peP = locala.vHC.readDouble();
        return 0;
      case 12: 
        localq.peQ = locala.vHC.rY();
        return 0;
      case 13: 
        localq.peR = locala.vHC.readString();
        return 0;
      case 14: 
        localq.lNT = locala.vHC.readString();
        return 0;
      case 16: 
        localq.peS = locala.vHC.readString();
        return 0;
      }
      localq.peT.add(locala.cJR());
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/wallet/a/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */