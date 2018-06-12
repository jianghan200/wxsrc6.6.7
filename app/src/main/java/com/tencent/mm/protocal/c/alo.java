package com.tencent.mm.protocal.c;

public final class alo
  extends com.tencent.mm.bk.a
{
  public String kLc;
  public String nickname;
  public long rNZ;
  public long rOa;
  public int rOb;
  public String rOc;
  public String username;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    int i;
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.T(1, this.rNZ);
      paramVarArgs.T(2, this.rOa);
      if (this.nickname != null) {
        paramVarArgs.g(3, this.nickname);
      }
      if (this.kLc != null) {
        paramVarArgs.g(4, this.kLc);
      }
      paramVarArgs.fT(5, this.rOb);
      if (this.username != null) {
        paramVarArgs.g(6, this.username);
      }
      if (this.rOc != null) {
        paramVarArgs.g(7, this.rOc);
      }
      i = 0;
    }
    do
    {
      return i;
      if (paramInt != 1) {
        break;
      }
      i = f.a.a.a.S(1, this.rNZ) + 0 + f.a.a.a.S(2, this.rOa);
      paramInt = i;
      if (this.nickname != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.nickname);
      }
      i = paramInt;
      if (this.kLc != null) {
        i = paramInt + f.a.a.b.b.a.h(4, this.kLc);
      }
      i += f.a.a.a.fQ(5, this.rOb);
      paramInt = i;
      if (this.username != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.username);
      }
      i = paramInt;
    } while (this.rOc == null);
    return paramInt + f.a.a.b.b.a.h(7, this.rOc);
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
      alo localalo = (alo)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localalo.rNZ = locala.vHC.rZ();
        return 0;
      case 2: 
        localalo.rOa = locala.vHC.rZ();
        return 0;
      case 3: 
        localalo.nickname = locala.vHC.readString();
        return 0;
      case 4: 
        localalo.kLc = locala.vHC.readString();
        return 0;
      case 5: 
        localalo.rOb = locala.vHC.rY();
        return 0;
      case 6: 
        localalo.username = locala.vHC.readString();
        return 0;
      }
      localalo.rOc = locala.vHC.readString();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/alo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */