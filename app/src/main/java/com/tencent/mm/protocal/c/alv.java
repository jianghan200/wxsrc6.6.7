package com.tencent.mm.protocal.c;

public final class alv
  extends com.tencent.mm.bk.a
{
  public int rOl;
  public com.tencent.mm.bk.b rOm;
  public com.tencent.mm.bk.b rOn;
  public com.tencent.mm.bk.b rOo;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rOm == null) {
        throw new f.a.a.b("Not all required fields were included: SPSBuf");
      }
      if (this.rOn == null) {
        throw new f.a.a.b("Not all required fields were included: PPSBuf");
      }
      paramVarArgs.fT(1, this.rOl);
      if (this.rOm != null) {
        paramVarArgs.b(2, this.rOm);
      }
      if (this.rOn != null) {
        paramVarArgs.b(3, this.rOn);
      }
      if (this.rOo != null) {
        paramVarArgs.b(4, this.rOo);
      }
      paramInt = 0;
    }
    int i;
    do
    {
      return paramInt;
      if (paramInt != 1) {
        break;
      }
      i = f.a.a.a.fQ(1, this.rOl) + 0;
      paramInt = i;
      if (this.rOm != null) {
        paramInt = i + f.a.a.a.a(2, this.rOm);
      }
      i = paramInt;
      if (this.rOn != null) {
        i = paramInt + f.a.a.a.a(3, this.rOn);
      }
      paramInt = i;
    } while (this.rOo == null);
    return i + f.a.a.a.a(4, this.rOo);
    if (paramInt == 2)
    {
      paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      if (this.rOm == null) {
        throw new f.a.a.b("Not all required fields were included: SPSBuf");
      }
      if (this.rOn == null) {
        throw new f.a.a.b("Not all required fields were included: PPSBuf");
      }
      return 0;
    }
    if (paramInt == 3)
    {
      f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
      alv localalv = (alv)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localalv.rOl = locala.vHC.rY();
        return 0;
      case 2: 
        localalv.rOm = locala.cJR();
        return 0;
      case 3: 
        localalv.rOn = locala.cJR();
        return 0;
      }
      localalv.rOo = locala.cJR();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/alv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */