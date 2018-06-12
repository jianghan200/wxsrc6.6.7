package com.tencent.mm.protocal.c;

import f.a.a.b;

public final class jx
  extends com.tencent.mm.bk.a
{
  public String bHD;
  public String jPK;
  public String rlr;
  public String rls;
  public int rlt;
  public String rlu;
  public int rlv;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.bHD == null) {
        throw new b("Not all required fields were included: Title");
      }
      if (this.jPK == null) {
        throw new b("Not all required fields were included: Url");
      }
      if (this.rlr == null) {
        throw new b("Not all required fields were included: Position");
      }
      if (this.rls == null) {
        throw new b("Not all required fields were included: DetailInfo");
      }
      if (this.bHD != null) {
        paramVarArgs.g(1, this.bHD);
      }
      if (this.jPK != null) {
        paramVarArgs.g(2, this.jPK);
      }
      if (this.rlr != null) {
        paramVarArgs.g(3, this.rlr);
      }
      if (this.rls != null) {
        paramVarArgs.g(4, this.rls);
      }
      paramVarArgs.fT(5, this.rlt);
      if (this.rlu != null) {
        paramVarArgs.g(6, this.rlu);
      }
      paramVarArgs.fT(7, this.rlv);
      return 0;
    }
    if (paramInt == 1) {
      if (this.bHD == null) {
        break label613;
      }
    }
    label613:
    for (int i = f.a.a.b.b.a.h(1, this.bHD) + 0;; i = 0)
    {
      paramInt = i;
      if (this.jPK != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.jPK);
      }
      i = paramInt;
      if (this.rlr != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.rlr);
      }
      paramInt = i;
      if (this.rls != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rls);
      }
      i = paramInt + f.a.a.a.fQ(5, this.rlt);
      paramInt = i;
      if (this.rlu != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.rlu);
      }
      return paramInt + f.a.a.a.fQ(7, this.rlv);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.bHD == null) {
          throw new b("Not all required fields were included: Title");
        }
        if (this.jPK == null) {
          throw new b("Not all required fields were included: Url");
        }
        if (this.rlr == null) {
          throw new b("Not all required fields were included: Position");
        }
        if (this.rls != null) {
          break;
        }
        throw new b("Not all required fields were included: DetailInfo");
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        jx localjx = (jx)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localjx.bHD = locala.vHC.readString();
          return 0;
        case 2: 
          localjx.jPK = locala.vHC.readString();
          return 0;
        case 3: 
          localjx.rlr = locala.vHC.readString();
          return 0;
        case 4: 
          localjx.rls = locala.vHC.readString();
          return 0;
        case 5: 
          localjx.rlt = locala.vHC.rY();
          return 0;
        case 6: 
          localjx.rlu = locala.vHC.readString();
          return 0;
        }
        localjx.rlv = locala.vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/protocal/c/jx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */