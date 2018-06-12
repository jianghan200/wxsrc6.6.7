package com.tencent.mm.protocal.c;

public final class de
  extends com.tencent.mm.bk.a
{
  public String rdl;
  public String rdm;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rdl != null) {
        paramVarArgs.g(1, this.rdl);
      }
      if (this.rdm != null) {
        paramVarArgs.g(2, this.rdm);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.rdl == null) {
        break label234;
      }
    }
    label234:
    for (paramInt = f.a.a.b.b.a.h(1, this.rdl) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.rdm != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.rdm);
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
        de localde = (de)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localde.rdl = locala.vHC.readString();
          return 0;
        }
        localde.rdm = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/de.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */