package com.tencent.mm.protocal.c;

import f.a.a.b;

public final class atm
  extends com.tencent.mm.bk.a
{
  public String bSc;
  public String rWQ;
  public String rWR;
  public String rWS;
  public int rWT;
  public int type;
  public String url;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.bSc == null) {
        throw new b("Not all required fields were included: wording");
      }
      paramVarArgs.fT(1, this.type);
      if (this.bSc != null) {
        paramVarArgs.g(2, this.bSc);
      }
      if (this.url != null) {
        paramVarArgs.g(3, this.url);
      }
      if (this.rWQ != null) {
        paramVarArgs.g(4, this.rWQ);
      }
      if (this.rWR != null) {
        paramVarArgs.g(5, this.rWR);
      }
      if (this.rWS != null) {
        paramVarArgs.g(6, this.rWS);
      }
      paramVarArgs.fT(7, this.rWT);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = f.a.a.a.fQ(1, this.type) + 0;
      paramInt = i;
      if (this.bSc != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.bSc);
      }
      i = paramInt;
      if (this.url != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.url);
      }
      paramInt = i;
      if (this.rWQ != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rWQ);
      }
      i = paramInt;
      if (this.rWR != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.rWR);
      }
      paramInt = i;
      if (this.rWS != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.rWS);
      }
      return paramInt + f.a.a.a.fQ(7, this.rWT);
    }
    if (paramInt == 2)
    {
      paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      if (this.bSc == null) {
        throw new b("Not all required fields were included: wording");
      }
      return 0;
    }
    if (paramInt == 3)
    {
      f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
      atm localatm = (atm)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localatm.type = locala.vHC.rY();
        return 0;
      case 2: 
        localatm.bSc = locala.vHC.readString();
        return 0;
      case 3: 
        localatm.url = locala.vHC.readString();
        return 0;
      case 4: 
        localatm.rWQ = locala.vHC.readString();
        return 0;
      case 5: 
        localatm.rWR = locala.vHC.readString();
        return 0;
      case 6: 
        localatm.rWS = locala.vHC.readString();
        return 0;
      }
      localatm.rWT = locala.vHC.rY();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/atm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */