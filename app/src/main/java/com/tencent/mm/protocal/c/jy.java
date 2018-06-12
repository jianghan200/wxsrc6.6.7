package com.tencent.mm.protocal.c;

import f.a.a.b;

public final class jy
  extends com.tencent.mm.bk.a
{
  public String lPm;
  public String rlA;
  public String rlw;
  public String rlx;
  public String rly;
  public int rlz;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rlw == null) {
        throw new b("Not all required fields were included: ProductId");
      }
      if (this.lPm == null) {
        throw new b("Not all required fields were included: ProductName");
      }
      if (this.rlx == null) {
        throw new b("Not all required fields were included: SellerName");
      }
      if (this.rly == null) {
        throw new b("Not all required fields were included: SellerUserName");
      }
      if (this.rlw != null) {
        paramVarArgs.g(1, this.rlw);
      }
      if (this.lPm != null) {
        paramVarArgs.g(2, this.lPm);
      }
      if (this.rlx != null) {
        paramVarArgs.g(3, this.rlx);
      }
      if (this.rly != null) {
        paramVarArgs.g(4, this.rly);
      }
      paramVarArgs.fT(5, this.rlz);
      if (this.rlA != null) {
        paramVarArgs.g(6, this.rlA);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.rlw == null) {
        break label574;
      }
    }
    label574:
    for (int i = f.a.a.b.b.a.h(1, this.rlw) + 0;; i = 0)
    {
      paramInt = i;
      if (this.lPm != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.lPm);
      }
      i = paramInt;
      if (this.rlx != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.rlx);
      }
      paramInt = i;
      if (this.rly != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rly);
      }
      i = paramInt + f.a.a.a.fQ(5, this.rlz);
      paramInt = i;
      if (this.rlA != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.rlA);
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.rlw == null) {
          throw new b("Not all required fields were included: ProductId");
        }
        if (this.lPm == null) {
          throw new b("Not all required fields were included: ProductName");
        }
        if (this.rlx == null) {
          throw new b("Not all required fields were included: SellerName");
        }
        if (this.rly != null) {
          break;
        }
        throw new b("Not all required fields were included: SellerUserName");
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        jy localjy = (jy)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localjy.rlw = locala.vHC.readString();
          return 0;
        case 2: 
          localjy.lPm = locala.vHC.readString();
          return 0;
        case 3: 
          localjy.rlx = locala.vHC.readString();
          return 0;
        case 4: 
          localjy.rly = locala.vHC.readString();
          return 0;
        case 5: 
          localjy.rlz = locala.vHC.rY();
          return 0;
        }
        localjy.rlA = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/jy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */