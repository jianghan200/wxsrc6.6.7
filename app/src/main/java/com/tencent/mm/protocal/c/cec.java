package com.tencent.mm.protocal.c;

import f.a.a.b;

public final class cec
  extends com.tencent.mm.bk.a
{
  public String cCZ;
  public String hbQ;
  public int rdn;
  public String ruf;
  public String szd;
  public String sze;
  public String szf;
  public String szg;
  public String szh;
  public String szi;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.szd == null) {
        throw new b("Not all required fields were included: LocalNodeId");
      }
      if (this.szd != null) {
        paramVarArgs.g(1, this.szd);
      }
      if (this.hbQ != null) {
        paramVarArgs.g(2, this.hbQ);
      }
      if (this.sze != null) {
        paramVarArgs.g(3, this.sze);
      }
      if (this.cCZ != null) {
        paramVarArgs.g(4, this.cCZ);
      }
      if (this.szf != null) {
        paramVarArgs.g(5, this.szf);
      }
      if (this.ruf != null) {
        paramVarArgs.g(6, this.ruf);
      }
      if (this.szg != null) {
        paramVarArgs.g(7, this.szg);
      }
      if (this.szh != null) {
        paramVarArgs.g(8, this.szh);
      }
      if (this.szi != null) {
        paramVarArgs.g(9, this.szi);
      }
      paramVarArgs.fT(10, this.rdn);
      return 0;
    }
    if (paramInt == 1) {
      if (this.szd == null) {
        break label698;
      }
    }
    label698:
    for (int i = f.a.a.b.b.a.h(1, this.szd) + 0;; i = 0)
    {
      paramInt = i;
      if (this.hbQ != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.hbQ);
      }
      i = paramInt;
      if (this.sze != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.sze);
      }
      paramInt = i;
      if (this.cCZ != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.cCZ);
      }
      i = paramInt;
      if (this.szf != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.szf);
      }
      paramInt = i;
      if (this.ruf != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.ruf);
      }
      i = paramInt;
      if (this.szg != null) {
        i = paramInt + f.a.a.b.b.a.h(7, this.szg);
      }
      paramInt = i;
      if (this.szh != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.szh);
      }
      i = paramInt;
      if (this.szi != null) {
        i = paramInt + f.a.a.b.b.a.h(9, this.szi);
      }
      return i + f.a.a.a.fQ(10, this.rdn);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.szd != null) {
          break;
        }
        throw new b("Not all required fields were included: LocalNodeId");
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        cec localcec = (cec)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localcec.szd = locala.vHC.readString();
          return 0;
        case 2: 
          localcec.hbQ = locala.vHC.readString();
          return 0;
        case 3: 
          localcec.sze = locala.vHC.readString();
          return 0;
        case 4: 
          localcec.cCZ = locala.vHC.readString();
          return 0;
        case 5: 
          localcec.szf = locala.vHC.readString();
          return 0;
        case 6: 
          localcec.ruf = locala.vHC.readString();
          return 0;
        case 7: 
          localcec.szg = locala.vHC.readString();
          return 0;
        case 8: 
          localcec.szh = locala.vHC.readString();
          return 0;
        case 9: 
          localcec.szi = locala.vHC.readString();
          return 0;
        }
        localcec.rdn = locala.vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/cec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */