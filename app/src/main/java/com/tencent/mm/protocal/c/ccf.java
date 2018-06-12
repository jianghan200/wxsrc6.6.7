package com.tencent.mm.protocal.c;

public final class ccf
  extends com.tencent.mm.bk.a
{
  public String jPM;
  public String jTv;
  public String sdK;
  public String syi;
  public String syj;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.sdK != null) {
        paramVarArgs.g(1, this.sdK);
      }
      if (this.syi != null) {
        paramVarArgs.g(2, this.syi);
      }
      if (this.jTv != null) {
        paramVarArgs.g(3, this.jTv);
      }
      if (this.jPM != null) {
        paramVarArgs.g(4, this.jPM);
      }
      if (this.syj != null) {
        paramVarArgs.g(5, this.syj);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.sdK == null) {
        break label399;
      }
    }
    label399:
    for (int i = f.a.a.b.b.a.h(1, this.sdK) + 0;; i = 0)
    {
      paramInt = i;
      if (this.syi != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.syi);
      }
      i = paramInt;
      if (this.jTv != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.jTv);
      }
      paramInt = i;
      if (this.jPM != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.jPM);
      }
      i = paramInt;
      if (this.syj != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.syj);
      }
      return i;
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
        ccf localccf = (ccf)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localccf.sdK = locala.vHC.readString();
          return 0;
        case 2: 
          localccf.syi = locala.vHC.readString();
          return 0;
        case 3: 
          localccf.jTv = locala.vHC.readString();
          return 0;
        case 4: 
          localccf.jPM = locala.vHC.readString();
          return 0;
        }
        localccf.syj = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/ccf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */