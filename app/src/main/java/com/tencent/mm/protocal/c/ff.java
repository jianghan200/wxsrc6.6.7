package com.tencent.mm.protocal.c;

public final class ff
  extends com.tencent.mm.bk.a
{
  public String hFn;
  public String knE;
  public String lMV;
  public String pjw;
  public String rgb;
  public String rgc;
  public String rgd;
  public boolean rge;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.knE != null) {
        paramVarArgs.g(1, this.knE);
      }
      if (this.lMV != null) {
        paramVarArgs.g(2, this.lMV);
      }
      if (this.hFn != null) {
        paramVarArgs.g(3, this.hFn);
      }
      if (this.pjw != null) {
        paramVarArgs.g(4, this.pjw);
      }
      if (this.rgb != null) {
        paramVarArgs.g(5, this.rgb);
      }
      if (this.rgc != null) {
        paramVarArgs.g(6, this.rgc);
      }
      if (this.rgd != null) {
        paramVarArgs.g(8, this.rgd);
      }
      paramVarArgs.av(9, this.rge);
      return 0;
    }
    if (paramInt == 1) {
      if (this.knE == null) {
        break label549;
      }
    }
    label549:
    for (int i = f.a.a.b.b.a.h(1, this.knE) + 0;; i = 0)
    {
      paramInt = i;
      if (this.lMV != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.lMV);
      }
      i = paramInt;
      if (this.hFn != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.hFn);
      }
      paramInt = i;
      if (this.pjw != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.pjw);
      }
      i = paramInt;
      if (this.rgb != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.rgb);
      }
      paramInt = i;
      if (this.rgc != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.rgc);
      }
      i = paramInt;
      if (this.rgd != null) {
        i = paramInt + f.a.a.b.b.a.h(8, this.rgd);
      }
      return i + (f.a.a.b.b.a.ec(9) + 1);
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
        ff localff = (ff)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        case 7: 
        default: 
          return -1;
        case 1: 
          localff.knE = locala.vHC.readString();
          return 0;
        case 2: 
          localff.lMV = locala.vHC.readString();
          return 0;
        case 3: 
          localff.hFn = locala.vHC.readString();
          return 0;
        case 4: 
          localff.pjw = locala.vHC.readString();
          return 0;
        case 5: 
          localff.rgb = locala.vHC.readString();
          return 0;
        case 6: 
          localff.rgc = locala.vHC.readString();
          return 0;
        case 8: 
          localff.rgd = locala.vHC.readString();
          return 0;
        }
        localff.rge = locala.cJQ();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/ff.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */