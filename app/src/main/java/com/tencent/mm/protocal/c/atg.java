package com.tencent.mm.protocal.c;

public final class atg
  extends com.tencent.mm.bk.a
{
  public float rWu;
  public float rWv;
  public float rWw;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.l(1, this.rWu);
      paramVarArgs.l(2, this.rWv);
      paramVarArgs.l(3, this.rWw);
      return 0;
    }
    if (paramInt == 1) {
      return f.a.a.b.b.a.ec(1) + 4 + 0 + (f.a.a.b.b.a.ec(2) + 4) + (f.a.a.b.b.a.ec(3) + 4);
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
      f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
      atg localatg = (atg)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localatg.rWu = locala.vHC.readFloat();
        return 0;
      case 2: 
        localatg.rWv = locala.vHC.readFloat();
        return 0;
      }
      localatg.rWw = locala.vHC.readFloat();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/atg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */