package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class ju
  extends com.tencent.mm.bk.a
{
  public String bHD;
  public int hcf;
  public LinkedList<jz> jQF = new LinkedList();
  public int rjC;
  public long rll;
  public int rlm;
  public LinkedList<String> rln = new LinkedList();
  public String rlo;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rlo == null) {
        throw new b("Not all required fields were included: SearchID");
      }
      paramVarArgs.T(1, this.rll);
      paramVarArgs.fT(2, this.rlm);
      if (this.bHD != null) {
        paramVarArgs.g(3, this.bHD);
      }
      paramVarArgs.d(4, 1, this.rln);
      paramVarArgs.d(5, 8, this.jQF);
      paramVarArgs.fT(6, this.hcf);
      if (this.rlo != null) {
        paramVarArgs.g(7, this.rlo);
      }
      paramVarArgs.fT(8, this.rjC);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = f.a.a.a.S(1, this.rll) + 0 + f.a.a.a.fQ(2, this.rlm);
      paramInt = i;
      if (this.bHD != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.bHD);
      }
      i = paramInt + f.a.a.a.c(4, 1, this.rln) + f.a.a.a.c(5, 8, this.jQF) + f.a.a.a.fQ(6, this.hcf);
      paramInt = i;
      if (this.rlo != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.rlo);
      }
      return paramInt + f.a.a.a.fQ(8, this.rjC);
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.rln.clear();
      this.jQF.clear();
      paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      if (this.rlo == null) {
        throw new b("Not all required fields were included: SearchID");
      }
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
      ju localju = (ju)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        return -1;
      case 1: 
        localju.rll = ((f.a.a.a.a)localObject1).vHC.rZ();
        return 0;
      case 2: 
        localju.rlm = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 3: 
        localju.bHD = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      case 4: 
        localju.rln.add(((f.a.a.a.a)localObject1).vHC.readString());
        return 0;
      case 5: 
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new jz();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((jz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localju.jQF.add(localObject1);
          paramInt += 1;
        }
        return 0;
      case 6: 
        localju.hcf = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      case 7: 
        localju.rlo = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      localju.rjC = ((f.a.a.a.a)localObject1).vHC.rY();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/ju.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */