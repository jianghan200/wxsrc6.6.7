package com.tencent.mm.protocal.c;

public final class jw
  extends com.tencent.mm.bk.a
{
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0) {
      return 0;
    }
    if (paramInt == 1) {
      return 0;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      return 0;
    }
    if (paramInt == 3)
    {
      ((Integer)paramVarArgs[2]).intValue();
      return -1;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/jw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */