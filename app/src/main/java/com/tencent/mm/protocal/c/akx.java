package com.tencent.mm.protocal.c;

public final class akx
  extends com.tencent.mm.bk.a
{
  public String rNM;
  public String rNN;
  public String rwL;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rwL != null) {
        paramVarArgs.g(1, this.rwL);
      }
      if (this.rNM != null) {
        paramVarArgs.g(2, this.rNM);
      }
      if (this.rNN != null) {
        paramVarArgs.g(3, this.rNN);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.rwL == null) {
        break label289;
      }
    }
    label289:
    for (int i = f.a.a.b.b.a.h(1, this.rwL) + 0;; i = 0)
    {
      paramInt = i;
      if (this.rNM != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.rNM);
      }
      i = paramInt;
      if (this.rNN != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.rNN);
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
        akx localakx = (akx)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localakx.rwL = locala.vHC.readString();
          return 0;
        case 2: 
          localakx.rNM = locala.vHC.readString();
          return 0;
        }
        localakx.rNN = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/akx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */