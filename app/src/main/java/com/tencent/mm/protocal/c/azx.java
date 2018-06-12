package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class azx
  extends com.tencent.mm.bk.a
{
  public String desc;
  public String huW;
  public String name;
  public int paB;
  public String paC;
  public String paD;
  public String paE;
  public bfr scG;
  public String title;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.name != null) {
        paramVarArgs.g(1, this.name);
      }
      if (this.title != null) {
        paramVarArgs.g(2, this.title);
      }
      if (this.desc != null) {
        paramVarArgs.g(3, this.desc);
      }
      if (this.huW != null) {
        paramVarArgs.g(4, this.huW);
      }
      paramVarArgs.fT(5, this.paB);
      if (this.paC != null) {
        paramVarArgs.g(6, this.paC);
      }
      if (this.paD != null) {
        paramVarArgs.g(7, this.paD);
      }
      if (this.paE != null) {
        paramVarArgs.g(8, this.paE);
      }
      if (this.scG != null)
      {
        paramVarArgs.fV(9, this.scG.boi());
        this.scG.a(paramVarArgs);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.name == null) {
        break label705;
      }
    }
    label705:
    for (int i = f.a.a.b.b.a.h(1, this.name) + 0;; i = 0)
    {
      paramInt = i;
      if (this.title != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.title);
      }
      i = paramInt;
      if (this.desc != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.desc);
      }
      paramInt = i;
      if (this.huW != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.huW);
      }
      i = paramInt + f.a.a.a.fQ(5, this.paB);
      paramInt = i;
      if (this.paC != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.paC);
      }
      i = paramInt;
      if (this.paD != null) {
        i = paramInt + f.a.a.b.b.a.h(7, this.paD);
      }
      paramInt = i;
      if (this.paE != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.paE);
      }
      i = paramInt;
      if (this.scG != null) {
        i = paramInt + f.a.a.a.fS(9, this.scG.boi());
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
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        azx localazx = (azx)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          localazx.name = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 2: 
          localazx.title = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localazx.desc = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localazx.huW = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localazx.paB = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 6: 
          localazx.paC = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 7: 
          localazx.paD = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 8: 
          localazx.paE = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bfr();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((bfr)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localazx.scG = ((bfr)localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/azx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */