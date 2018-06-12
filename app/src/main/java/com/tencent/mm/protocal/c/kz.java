package com.tencent.mm.protocal.c;

public final class kz
  extends com.tencent.mm.bk.a
{
  public int create_time;
  public int mXw;
  public String rnt;
  public String text;
  public int type;
  public String url;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.type);
      if (this.text != null) {
        paramVarArgs.g(2, this.text);
      }
      if (this.url != null) {
        paramVarArgs.g(3, this.url);
      }
      paramVarArgs.fT(4, this.mXw);
      paramVarArgs.fT(5, this.create_time);
      if (this.rnt != null) {
        paramVarArgs.g(6, this.rnt);
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
      i = f.a.a.a.fQ(1, this.type) + 0;
      paramInt = i;
      if (this.text != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.text);
      }
      i = paramInt;
      if (this.url != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.url);
      }
      i = i + f.a.a.a.fQ(4, this.mXw) + f.a.a.a.fQ(5, this.create_time);
      paramInt = i;
    } while (this.rnt == null);
    return i + f.a.a.b.b.a.h(6, this.rnt);
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
      kz localkz = (kz)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localkz.type = locala.vHC.rY();
        return 0;
      case 2: 
        localkz.text = locala.vHC.readString();
        return 0;
      case 3: 
        localkz.url = locala.vHC.readString();
        return 0;
      case 4: 
        localkz.mXw = locala.vHC.rY();
        return 0;
      case 5: 
        localkz.create_time = locala.vHC.rY();
        return 0;
      }
      localkz.rnt = locala.vHC.readString();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/kz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */