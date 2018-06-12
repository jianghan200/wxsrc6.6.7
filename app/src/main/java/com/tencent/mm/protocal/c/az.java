package com.tencent.mm.protocal.c;

public final class az
  extends com.tencent.mm.bk.a
{
  public String bSc;
  public String bWP;
  public String paD;
  public String paE;
  public String pwk;
  public int pwl;
  public String title;
  public String url;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.url != null) {
        paramVarArgs.g(1, this.url);
      }
      if (this.bSc != null) {
        paramVarArgs.g(2, this.bSc);
      }
      if (this.bWP != null) {
        paramVarArgs.g(3, this.bWP);
      }
      if (this.pwk != null) {
        paramVarArgs.g(4, this.pwk);
      }
      if (this.title != null) {
        paramVarArgs.g(5, this.title);
      }
      if (this.paD != null) {
        paramVarArgs.g(6, this.paD);
      }
      if (this.paE != null) {
        paramVarArgs.g(7, this.paE);
      }
      paramVarArgs.fT(8, this.pwl);
      return 0;
    }
    if (paramInt == 1) {
      if (this.url == null) {
        break label552;
      }
    }
    label552:
    for (int i = f.a.a.b.b.a.h(1, this.url) + 0;; i = 0)
    {
      paramInt = i;
      if (this.bSc != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.bSc);
      }
      i = paramInt;
      if (this.bWP != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.bWP);
      }
      paramInt = i;
      if (this.pwk != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.pwk);
      }
      i = paramInt;
      if (this.title != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.title);
      }
      paramInt = i;
      if (this.paD != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.paD);
      }
      i = paramInt;
      if (this.paE != null) {
        i = paramInt + f.a.a.b.b.a.h(7, this.paE);
      }
      return i + f.a.a.a.fQ(8, this.pwl);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        break;
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        az localaz = (az)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localaz.url = locala.vHC.readString();
          return 0;
        case 2: 
          localaz.bSc = locala.vHC.readString();
          return 0;
        case 3: 
          localaz.bWP = locala.vHC.readString();
          return 0;
        case 4: 
          localaz.pwk = locala.vHC.readString();
          return 0;
        case 5: 
          localaz.title = locala.vHC.readString();
          return 0;
        case 6: 
          localaz.paD = locala.vHC.readString();
          return 0;
        case 7: 
          localaz.paE = locala.vHC.readString();
          return 0;
        }
        localaz.pwl = locala.vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/az.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */