package com.tencent.mm.protocal.c;

import f.a.a.b;

public final class bqt
  extends com.tencent.mm.bk.a
{
  public int egR;
  public int egS;
  public int egT;
  public int egU;
  public int opType;
  public String soR;
  public String soS;
  public String soT;
  public String soU;
  public long timeStamp;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    int i;
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.soR == null) {
        throw new b("Not all required fields were included: StatusDesc1");
      }
      if (this.soS == null) {
        throw new b("Not all required fields were included: StatusDesc2");
      }
      if (this.soT == null) {
        throw new b("Not all required fields were included: DataFlowSourceInfo");
      }
      if (this.soU == null) {
        throw new b("Not all required fields were included: DataFlowResultInfo");
      }
      paramVarArgs.fT(1, this.opType);
      paramVarArgs.fT(2, this.egU);
      paramVarArgs.fT(3, this.egR);
      paramVarArgs.T(4, this.timeStamp);
      paramVarArgs.fT(5, this.egS);
      paramVarArgs.fT(6, this.egT);
      if (this.soR != null) {
        paramVarArgs.g(7, this.soR);
      }
      if (this.soS != null) {
        paramVarArgs.g(8, this.soS);
      }
      if (this.soT != null) {
        paramVarArgs.g(9, this.soT);
      }
      if (this.soU != null) {
        paramVarArgs.g(10, this.soU);
      }
      i = 0;
    }
    do
    {
      return i;
      if (paramInt != 1) {
        break;
      }
      i = f.a.a.a.fQ(1, this.opType) + 0 + f.a.a.a.fQ(2, this.egU) + f.a.a.a.fQ(3, this.egR) + f.a.a.a.S(4, this.timeStamp) + f.a.a.a.fQ(5, this.egS) + f.a.a.a.fQ(6, this.egT);
      paramInt = i;
      if (this.soR != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.soR);
      }
      i = paramInt;
      if (this.soS != null) {
        i = paramInt + f.a.a.b.b.a.h(8, this.soS);
      }
      paramInt = i;
      if (this.soT != null) {
        paramInt = i + f.a.a.b.b.a.h(9, this.soT);
      }
      i = paramInt;
    } while (this.soU == null);
    return paramInt + f.a.a.b.b.a.h(10, this.soU);
    if (paramInt == 2)
    {
      paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      if (this.soR == null) {
        throw new b("Not all required fields were included: StatusDesc1");
      }
      if (this.soS == null) {
        throw new b("Not all required fields were included: StatusDesc2");
      }
      if (this.soT == null) {
        throw new b("Not all required fields were included: DataFlowSourceInfo");
      }
      if (this.soU == null) {
        throw new b("Not all required fields were included: DataFlowResultInfo");
      }
      return 0;
    }
    if (paramInt == 3)
    {
      f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
      bqt localbqt = (bqt)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localbqt.opType = locala.vHC.rY();
        return 0;
      case 2: 
        localbqt.egU = locala.vHC.rY();
        return 0;
      case 3: 
        localbqt.egR = locala.vHC.rY();
        return 0;
      case 4: 
        localbqt.timeStamp = locala.vHC.rZ();
        return 0;
      case 5: 
        localbqt.egS = locala.vHC.rY();
        return 0;
      case 6: 
        localbqt.egT = locala.vHC.rY();
        return 0;
      case 7: 
        localbqt.soR = locala.vHC.readString();
        return 0;
      case 8: 
        localbqt.soS = locala.vHC.readString();
        return 0;
      case 9: 
        localbqt.soT = locala.vHC.readString();
        return 0;
      }
      localbqt.soU = locala.vHC.readString();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/bqt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */