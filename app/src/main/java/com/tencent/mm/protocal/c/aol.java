package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class aol
  extends bhd
{
  public String bJT;
  public String bPS;
  public String rQE;
  public String rQF;
  public LinkedList<String> rQU = new LinkedList();
  public String rQV;
  public int scene;
  public String signature;
  public String url;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      if (this.url != null) {
        paramVarArgs.g(2, this.url);
      }
      if (this.bPS != null) {
        paramVarArgs.g(3, this.bPS);
      }
      paramVarArgs.d(4, 1, this.rQU);
      if (this.bJT != null) {
        paramVarArgs.g(5, this.bJT);
      }
      if (this.rQE != null) {
        paramVarArgs.g(6, this.rQE);
      }
      if (this.signature != null) {
        paramVarArgs.g(7, this.signature);
      }
      if (this.rQF != null) {
        paramVarArgs.g(8, this.rQF);
      }
      paramVarArgs.fT(9, this.scene);
      if (this.rQV != null) {
        paramVarArgs.g(10, this.rQV);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label760;
      }
    }
    label760:
    for (int i = f.a.a.a.fS(1, this.shX.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.url != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.url);
      }
      i = paramInt;
      if (this.bPS != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.bPS);
      }
      i += f.a.a.a.c(4, 1, this.rQU);
      paramInt = i;
      if (this.bJT != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.bJT);
      }
      i = paramInt;
      if (this.rQE != null) {
        i = paramInt + f.a.a.b.b.a.h(6, this.rQE);
      }
      paramInt = i;
      if (this.signature != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.signature);
      }
      i = paramInt;
      if (this.rQF != null) {
        i = paramInt + f.a.a.b.b.a.h(8, this.rQF);
      }
      i += f.a.a.a.fQ(9, this.scene);
      paramInt = i;
      if (this.rQV != null) {
        paramInt = i + f.a.a.b.b.a.h(10, this.rQV);
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.rQU.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = bhd.a(paramVarArgs); paramInt > 0; paramInt = bhd.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        aol localaol = (aol)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            Object localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new fk();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((fk)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localaol.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localaol.url = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localaol.bPS = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localaol.rQU.add(((f.a.a.a.a)localObject1).vHC.readString());
          return 0;
        case 5: 
          localaol.bJT = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localaol.rQE = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 7: 
          localaol.signature = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 8: 
          localaol.rQF = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 9: 
          localaol.scene = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localaol.rQV = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/c/aol.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */