package com.tencent.mm.plugin.backup.h;

public final class u
  extends com.tencent.mm.bk.a
{
  public String cGI;
  public int hcA;
  public long hcB;
  public int hcz;
  public String mediaId;
  public String path;
  public int type;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.hcz);
      if (this.cGI != null) {
        paramVarArgs.g(2, this.cGI);
      }
      if (this.mediaId != null) {
        paramVarArgs.g(3, this.mediaId);
      }
      if (this.path != null) {
        paramVarArgs.g(4, this.path);
      }
      paramVarArgs.fT(5, this.type);
      paramVarArgs.fT(6, this.hcA);
      paramVarArgs.T(7, this.hcB);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = f.a.a.a.fQ(1, this.hcz) + 0;
      paramInt = i;
      if (this.cGI != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.cGI);
      }
      i = paramInt;
      if (this.mediaId != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.mediaId);
      }
      paramInt = i;
      if (this.path != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.path);
      }
      return paramInt + f.a.a.a.fQ(5, this.type) + f.a.a.a.fQ(6, this.hcA) + f.a.a.a.S(7, this.hcB);
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
      u localu = (u)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localu.hcz = locala.vHC.rY();
        return 0;
      case 2: 
        localu.cGI = locala.vHC.readString();
        return 0;
      case 3: 
        localu.mediaId = locala.vHC.readString();
        return 0;
      case 4: 
        localu.path = locala.vHC.readString();
        return 0;
      case 5: 
        localu.type = locala.vHC.rY();
        return 0;
      case 6: 
        localu.hcA = locala.vHC.rY();
        return 0;
      }
      localu.hcB = locala.vHC.rZ();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/backup/h/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */